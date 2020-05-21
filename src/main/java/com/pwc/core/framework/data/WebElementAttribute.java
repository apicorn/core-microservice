package com.pwc.core.framework.data;


public enum WebElementAttribute {

    ACCEPT("accept"),
    ACCEPT_CHARSET("accept-charset"),
    ACCESS_KEY("accesskey"),
    ACTION("action"),
    ALIGN("align"),
    ALT("alt"),
    ARIA_ATOMIC("aria-atomic"),
    ARIA_AUTOCOMPLETE("aria-autocomplete"),
    ARIA_BUSY("aria-busy"),
    ARIA_CHECKED("aria-checked"),
    ARIA_CONTROLS("aria-controls"),
    ARIA_DESCRIBEDBY("aria-describedby"),
    ARIA_DISABLED("aria-disabled"),
    ARIA_DROPEFFECT("aria-dropeffect"),
    ARIA_EXPANDED("aria-expanded"),
    ARIA_FLOWTO("aria-flowto"),
    ARIA_GRABBED("aria-grabbed"),
    ARIA_HASPOPUP("aria-haspopup"),
    ARIA_HIDDEN("aria-hidden"),
    ARIA_INVALID("aria-invalid"),
    ARIA_LABEL("aria-label"),
    ARIA_LABELLEDBY("aria-labelledby"),
    ARIA_LEVEL("aria-level"),
    ARIA_LIVE("aria-live"),
    ARIA_MULTILINE("aria-multiline"),
    ARIA_MULTISELECTABLE("aria-multiselectable"),
    ARIA_ORIENTATION("aria-orientation"),
    ARIA_OWNS("aria-owns"),
    ARIA_PRESSED("aria-pressed"),
    ARIA_READONLY("aria-readonly"),
    ARIA_RELEVANT("aria-relevant"),
    ARIA_REQUIRED("aria-required"),
    ARIA_SELECTED("aria-selected"),
    ARIA_SORT("aria-sort"),
    ARIA_VALUEMAX("aria-valuemax"),
    ARIA_VALUEMIN("aria-valuemin"),
    ARIA_VALUENOW("aria-valuenow"),
    ARIA_VALUETEXT("aria-valuetext"),
    ASYNC("async"),
    AUTOCOMPLETE("autocomplete"),
    AUTOFOCUS("autofocus"),
    AUTOPLAY("autoplay"),
    CELL_PADDING("cellpadding"),
    CHECKED("checked"),
    CLASS("class"),
    CLASS_ROLE("class role"),
    COLSPAN("colspan"),
    CONTENT_EDITABLE("contenteditable"),
    CONTEXT_MENU("contextmenu"),
    DATA_SELECTOR("data-selector"),
    DIR("dir"),
    DISABLED("disabled"),
    DRAGGABLE("draggable "),
    DROPZONE("dropzone "),
    HIDDEN("hidden"),
    HREF("href"),
    ID("id"),
    INNER_HTML("innerHTML"),
    LANG("lang"),
    LINKTO("linkto"),
    MAX("max"),
    MIN("min"),
    MULTIPLE("multiple"),
    NAME("name"),
    NG_ATTR_SIZE("ng-attr-size"),
    NG_BIND("ng-bind"),
    NG_BIND_HTML("ng-bind-html"),
    NG_BIND_TEMPLATE("ng-bind-template"),
    NG_BLUR("ng-blur"),
    NG_CHANGE("ng-change"),
    NG_CHECKED("ng-checked"),
    NG_CLASS("ng-class"),
    NG_CLASS_EVEN("ng-class-even"),
    NG_CLASS_ODD("ng-class-odd"),
    NG_CLICK("ng-click"),
    NG_CLOAK("ng-cloak"),
    NG_CONTROLLER("ng-controller"),
    NG_COPY("ng-copy"),
    NG_CSP("ng-csp"),
    NG_CUT("ng-cut"),
    NG_DBL_CLICK("ng-dblclick"),
    NG_DISABLED("ng-disabled"),
    NG_FALSE_VALUE("ng-false-value"),
    NG_FOCUS("ng-focus"),
    NG_FORM("ng-form"),
    NG_HIDE("ng-hide"),
    NG_HREF("ng-href"),
    NG_IF("ng-if"),
    NG_INCLUDE("ng-include"),
    NG_INIT("ng-init"),
    NG_JQ("ng-jq"),
    NG_KEY_DOWN("ng-keydown"),
    NG_KEY_PRESS("ng-keypress"),
    NG_KEY_UP("ng-keyup"),
    NG_LIST("ng-list"),
    NG_MAX("ng-max"),
    NG_MAX_LENGTH("ng-maxlength"),
    NG_MIN("ng-min"),
    NG_MIN_LENGTH("ng-minlength"),
    NG_MODEL("ng-model"),
    NG_MOUSE_DOWN("ng-mousedown"),
    NG_MOUSE_ENTER("ng-mouseenter"),
    NG_MOUSE_LEAVE("ng-mouseleave"),
    NG_MOUSE_MOVE("ng-mousemove"),
    NG_MOUSE_OVER("ng-mouseover"),
    NG_MOUSE_UP("ng-mouseup"),
    NG_NON_BINDABLE("ng-non-bindable"),
    NG_OPEN("ng-open"),
    NG_OPTIONS("ng-options"),
    NG_PASTE("ng-paste"),
    NG_PATTERN("ng-pattern"),
    NG_PLURALIZE("ng-pluralize"),
    NG_READ_ONLY("ng-readonly"),
    NG_REF("ng-ref"),
    NG_REF_READ("ng-ref-read"),
    NG_REFLECT_ACTIVE("ng-reflect-active"),
    NG_REFLECT_CLASS("ng-reflect-class"),
    NG_REFLECT_FILTER("ng-reflect-filter"),
    NG_REFLECT_HOUR("ng-reflect-hour"),
    NG_REFLECT_ICON("ng-reflect-icon"),
    NG_REFLECT_INPUT_ID("ng-reflect-input-id"),
    NG_REFLECT_LABEL("ng-reflect-label"),
    NG_REFLECT_MODEL("ng-reflect-model"),
    NG_REFLECT_STYLE("ng-reflect-style"),
    NG_REFLECT_VDS_ID("ng-reflect-vds-id"),
    NG_REPEAT("ng-repeat"),
    NG_REQUIRED("ng-required"),
    NG_SELECTED("ng-selected"),
    NG_SHOW("ng-show"),
    NG_SRC("ng-src"),
    NG_SRC_SET("ng-srcset"),
    NG_STEP("ng-step"),
    NG_STYLE("ng-style"),
    NG_SUBMIT("ng-submit"),
    NG_SWITCH("ng-switch"),
    NG_TRANSCLUDE("ng-transclude"),
    NG_TRIM("ng-trim"),
    NG_TRUE_VALUE("ng-true-value"),
    NG_VALUE("ng-value"),
    ONCLICK("onclick"),
    PLACEHOLDER("placeholder"),
    READONLY("readonly"),
    REQUIRED("required"),
    ROLE("role"),
    SELECTED("selected"),
    SIZE("size"),
    SPELLCHECK("spellcheck"),
    SRC("src"),
    STEP("step"),
    STROKE("stroke"),
    STYLE("style"),
    TAB_INDEX("tabindex"),
    TARGET("target"),
    TEXT("text"),
    TITLE("title"),
    TRANSLATE("translate"),
    TYPE("type"),
    UNSELECTABLE("unselectable"),
    VALIGN("valign"),
    VALUE("value");

    public String attribute;

    WebElementAttribute(String a) {
        attribute = a;
    }

}
