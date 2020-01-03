package com.pwc.core.framework.processors.mobile.gestures;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.pwc.core.framework.data.MobileGesture;
import io.appium.java_client.MobileElement;
import org.apache.commons.lang3.StringUtils;

import java.util.HashMap;
import java.util.Map;

import static com.pwc.assertion.AssertService.assertFail;
import static com.pwc.logging.service.LoggerService.LOG;

public class DragFromToForDurationImpl {

    public static boolean applies(MobileGesture gesture) {
        return (StringUtils.equalsIgnoreCase(gesture.gesture, MobileGesture.DRAG_FROM_TO_FOR_DURATION.gesture));
    }

    public Map buildParameters(final MobileElement element, MobileGesture mobileGesture, DragFromToForDuration dragFromToForDurationParameters) {

        Map<String, Object> convertedParameters = new HashMap();
        try {
            LOG(true, "Perform '%s' GESTURE", mobileGesture.gesture);
            ObjectMapper mapper = new ObjectMapper();
            mapper.configure(SerializationFeature.FAIL_ON_EMPTY_BEANS, false);
            if (null == dragFromToForDurationParameters) {
                dragFromToForDurationParameters = DragFromToForDuration.builder()  //
                        .element(element.getId())  //
                        .duration(5)  //
                        .fromX(100)  //
                        .fromY(100)  //
                        .toX(200)  //
                        .toY(100).build();
            } else {
                dragFromToForDurationParameters.setElement(element.getId());
            }
            convertedParameters = mapper.convertValue(dragFromToForDurationParameters, Map.class);
        } catch (Exception e) {
            assertFail("Failed to perform GESTURE '%s' due to exception=%s", mobileGesture.gesture, e.getMessage());
        }
        return convertedParameters;
    }

}