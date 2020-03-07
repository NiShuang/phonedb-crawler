import com.alibaba.fastjson.JSON;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author: Ciel
 * @Date: 2020-02-19
 * @Description:
 */
public class PhoneDbHelper {

//    public static Integer getMaxId() {
//        String url = "http://phonedb.net/index.php?m=device&s=list&order_field=added_ts&order_mode=desc&filter=0";
//        Document document;
//        try {
//            document = Jsoup.connect(url).get();
//        } catch (IOException e) {
//            e.printStackTrace();
//            return null;
//        }
//        Element div = document.getElementsByClass("content_block_title").first();
//        if (div != null) {
//            Element a = div.getElementsByTag("a").first();
//            if (a != null) {
//                String link = a.attr("href");
//                if (link != null) {
//                    Pattern pattern = Pattern.compile("&id=(\\d+)");
//                    Matcher matcher = pattern.matcher(link);
//                    if (matcher.find()) {
//                        return Integer.parseInt(matcher.group(1));
//                    }
//                }
//            }
//        }
//        return null;
//    }

    public static MobilePhoneInfo getPhoneInfo(int id) throws IOException  {
        String url = "http://phonedb.net/index.php?m=device&id=" + id;
        Document document = Jsoup.connect(url).get();
        Element errorEl = document.getElementsContainingOwnText("Error 404: not found").first();
        if (errorEl != null) {
            return null;
        }
        MobilePhoneInfo mobilePhoneInfo = new MobilePhoneInfo();
        String brief = getValueByField(document, "^Brief$");
        mobilePhoneInfo.setBrief(brief == null ? null : brief.replace("›", ""));
        mobilePhoneInfo.setBrand(getValueByField(document, "^Brand$"));
        mobilePhoneInfo.setModel(getValueByField(document, "^Model$"));
        mobilePhoneInfo.setReleased(getValueByField(document, "^Released$"));
        mobilePhoneInfo.setDeviceCategory(getValueByField(document, "^Device Category$"));
        mobilePhoneInfo.setPlatform(getValueByField(document, "^Platform$"));
        mobilePhoneInfo.setOperationSystem(getValueByField(document, "^Operating System$"));
        mobilePhoneInfo.setCpuClock(getValueByField(document, "^CPU Clock$"));
        mobilePhoneInfo.setCpu(getValueByField(document, "^CPU$"));
        mobilePhoneInfo.setRamType(getValueByField(document, "^RAM Type$"));
        mobilePhoneInfo.setRamCapacity(getValueByField(document, "^RAM Capacity \\(converted\\)$"));
        mobilePhoneInfo.setNonVolatileMemoryCapacity(getValueByField(document, "^Non-volatile Memory Capacity \\(converted\\)$"));
        mobilePhoneInfo.setResolution(getValueByField(document, "^Resolution$"));
        mobilePhoneInfo.setPixelDensity(getValueByField(document, "^Pixel Density$"));
        mobilePhoneInfo.setGraphicalController(getValueByField(document, "^Graphical Controller$"));
        mobilePhoneInfo.setGpuClock(getValueByField(document, "^GPU Clock$"));
        mobilePhoneInfo.setId(id);
        String added = getValueByField(document, "^Added$");
        mobilePhoneInfo.setAdded(added == null ? null : LocalDateTime.parse(added, DateTimeFormatter.ofPattern("uuuu-MM-dd HH:mm")));
        mobilePhoneInfo.setCreateTime(LocalDateTime.now(ZoneId.of("GMT+8")));
        System.out.println(JSON.toJSON(mobilePhoneInfo).toString());
        return mobilePhoneInfo;
    }

    private static String getValueByField(Document document, String field) {
        Element filedEl = document.getElementsMatchingOwnText(field).first();
        if (filedEl != null) {
            Element valueEl = filedEl.parent().nextElementSibling();
            if (valueEl != null) {
                return valueEl.text();
            }
        }
        return null;
    }

    public static void main(String[] args) throws IOException {
        System.out.println(getPhoneInfo(16651));
    }
}
