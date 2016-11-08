package qcom.itlegal.ipit.framework.processors.web.elements;

import org.apache.commons.lang3.StringUtils;
import org.openqa.selenium.WebElement;
import qcom.itlegal.ipit.framework.data.WebElementType;

import static com.qualcomm.qherkin.QherkinLoggerService.LOG;
import static com.qualcomm.qssert.QssertService.assertFail;

public class IconElementImpl implements QualcommWebElement {

    public static boolean applies(WebElement element) {
        return StringUtils.equalsIgnoreCase(element.getTagName(), WebElementType.ICON.type);
    }

    public void webAction(final WebElement webElement, final Object attributeValue) {
        webAction(webElement);
    }

    public void webAction(final WebElement webElement) {
        try {
            LOG(true, "Click %s", "ICON");
            webElement.click();
        } catch (Exception e) {
            assertFail("Failed to Select ICON due to exception=%s", e.getMessage());
        }
    }
}
