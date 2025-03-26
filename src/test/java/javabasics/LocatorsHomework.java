package javabasics;

import org.openqa.selenium.By;

public class LocatorsHomework {
    //ia.lv
    private final By CONTACTS_LINK = By.xpath("//a[@class='site-top__menu-right-link' and contains(@href, 'kontakti')]");
    private final By MAIN_LOGO_IMAGE = By.xpath(".//a[@class = 'main-logo']");
    private final By SEARCH_SUBMIT_BTN = By.xpath(".//div[@class='main-search-submit']");
    private final By CART_BLOCK_HANDLE = By.xpath(".//a[@class='cart-block__handle']");
    private final By MAIN_MENU_HANDLE = By.xpath(".//a[@class='main-menu__handle']");
    private final By GAME_CONSOLES_ALL_ITEMS = By.xpath("//div[@class='main-menu-wrap']//a[@class='submenu-lvl2__block-title-link' and contains (@href, 'a4h')]");
    private final By SUBMENU_SPORT_FITNESS = By.xpath(".//div[@class='main-menu-wrap']//a[@class='submenu-lvl1__link' and contains (@href, '2pj')]");
    private final By COOKIE_DETAILS_BTN = By.id("CybotCookiebotDialogBodyLevelDetailsButton");
    //amazon
    private final By SEARCH_WRAPPER = By.xpath(".//div[@class='nav-bb-search-wrapper']");
    private final By ICP_NAV_FLYOUT = By.id("icp-nav-flyout");
    private final By NAV_CART = By.id("nav-cart");
    private final By NAV_HAMBURGER_MENU = By.id("nav-hamburger-menu");
    private final By CHANGE_ADDRESS_BTN = By.xpath (".//input[@class='a-button-input' and @data-action-type='SELECT_LOCATION']");
    private final By TOP_PRODUCTS_FREE_DELIVERY = By.xpath(".//div[@class='a-cardui _fluid-quad-image-label-v2_style_fluidQuadImageLabel__3b-Iv' and @data-card-metrics-id='fluid-quad-image-label-v2_desktop-gateway-atf_2']");
    //delfi.lv
    private final By HEADER_MENU_NAMES_BTN = By.xpath(".//a[@class='btn header-menu__item-content btn-link btn-size-default' and @href='https://www.delfi.lv']");
    private final By HEADER_MENU_CONTACTS_BTN = By.xpath(".//a[@class='btn header-menu__item-content btn-link btn-size-default' and @href='https://www.delfi.lv/kontakti']");
    private final By LOGO_LINK = By.xpath(".//span[@class='d-flex align-items-center']");
    private final By HEADER_MENU_BUSINESS = By.xpath(".//a[@class='btn header-menu__item-content btn-link btn-size-default' and @href='https://www.delfi.lv/bizness']");
    private final By LANGUAGE_SWITCH = By.xpath(".//a[@class='btn language-switch text-size-7 fw-bold btn-size-auto']");
    private final By HEADER_MENU_PRIMARY_CONTAINER = By.xpath(".//div[@class='header-menu--primary-container d-flex justify-content-between flex-nowrap align-items-center h-100 position-relative bottom-header d-none d-lg-flex']");
    private final By HEADLINE_TITLE_2 = By.xpath("//div[@data-item-id='505']//h4[@class='headline__title']");
    //sportsdirect.lv
    private final By MAIN_SEARCH = By.xpath(".//div[@class='col-xs-12 col-sm-4 search']");
    private final By LOGIN_MENU_BTN = By.id("loginMenu");
    private final By HOME_CAROUSEL_SLIDE_1 = By.xpath("//div[@id='cms-home-placement-1']//div[@class='Carousel_slide__03AmD active Carousel_autoFit__cTtdL']");
    private final By CHRISTMAS_LINK = By.xpath(".//img[@class='Image_image__wIrJI Image_landscape__wLQs_ Image_squareMobile__TDhbL' and @alt='Christmas starts here']");
    private final By SHOP_NOW_BUTTON = By.xpath(".//a[@class='Link_root__TBCX5 Button_root__iZF6l Button_isFunctional__QZALP Button_primary__fIOgP' and contains(@href, 'yeezy')]");
    private final By HOME_SUBHEADING_1 = By.xpath("//div[@id='cms-home-placement-3']//h2[@class='Typography_subheading1__ZXKBr BlockHeader_title__Uvq9Q']");
}
