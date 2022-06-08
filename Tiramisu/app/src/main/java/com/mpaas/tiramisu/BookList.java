package com.mpaas.tiramisu;

import java.util.List;

/**
 * @author ctt
 * @description:
 * @date :2022/5/31 3:11 下午
 */
public class BookList {

    public int status;
    public Data data;
    public String message;
    public String errType;
    public Pager pager;

    public static class Data {
        public Pager pager;
        public java.util.List<List> list;
        public ListStat listStat;
        public Stat stat;
        public Conf conf;

        public static class Pager {
            public int pageCurr;
            public int pageShow;
            public int recordCount;
        }

        public static class ListStat {
            public int itemNum;
            public double amount;
            public int count;
        }

        public static class Stat {
            public int sale;
            public int haltsale;
            public int unsold;
            public int draft;
            public int uncertify;
        }

        public static class Conf {
            public int userId;
            public int shopId;
            public String shopName;
            public int useMyCat;
            public java.util.List<?> myCatList;
            public java.util.List<MyItemCats> myItemCats;
            public String bearShipping;
            public int isStartMould;
            public String defaultMouldId;
            public String defaultMouldName;
            public NewMouldList newMouldList;
            public NewMouldInfo newMouldInfo;
            public DefaultMouldInfo defaultMouldInfo;
            public Site site;
            public boolean isAuctioneer;

            public static class MouldList {
                public String _$8993;
            }

            public static class NewMouldList {
                public Data.Conf.NewMouldList._$8993 _$8993;
                public Data.Conf.NewMouldList._$115598 _$115598;

                public static class _$8993 {
                    public String mouldId;
                    public String mouldName;
                    public String isTransfer;
                    public String isDefault;
                    public String isAppMould;
                    public String feeManner;
                    public String productArea;
                    public MouldInfo mouldInfo;

                    public static class MouldInfo {
                        public String mouldId;
                        public String userId;
                        public String mouldName;
                        public String productArea;
                        public String feeManner;
                        public java.util.List<String> sortOrder;
                        public String enableShipping;
                        public String dataMd5;
                        public String isDefault;
                        public String isAppMould;
                        public String description;
                        public String provId;
                        public String provName;
                        public String cityId;
                        public String cityName;
                        public String areaId;
                        public String areaName;
                        public FeeList feeList;

                        public static class FeeList {
                            public Express express;
                            public RegisterPost registerPost;

                            public static class Express {
                                public boolean enabled;
                                public String name;
                                public java.util.List<Special> special;

                                public static class Special {
                                    public int feeId;
                                    public java.util.List<Area> area;
                                    public String areaDivide;
                                    public int initialNum;
                                    public int addNum;
                                    public String addFee;
                                    public String initialFee;
                                    public String registerFee;

                                    public static class Area {
                                        public String provId;
                                        public String provName;
                                        public java.util.List<?> cities;
                                    }
                                }
                            }

                            public static class RegisterPost {
                                public boolean enabled;
                                public String name;
                                public java.util.List<Special> special;

                                public static class Special {
                                    public int feeId;
                                    public java.util.List<Area> area;
                                    public String areaDivide;
                                    public int initialNum;
                                    public int addNum;
                                    public String addFee;
                                    public String initialFee;
                                    public String registerFee;

                                    public static class Area {
                                        public String provId;
                                        public String provName;
                                        public java.util.List<?> cities;
                                    }
                                }
                            }
                        }
                    }
                }

                public static class _$115598 {
                    public String mouldId;
                    public String mouldName;
                    public String isTransfer;
                    public String isDefault;
                    public String isAppMould;
                    public String feeManner;
                    public String productArea;
                    public MouldInfo mouldInfo;

                    public static class MouldInfo {
                        public String mouldId;
                        public String userId;
                        public String mouldName;
                        public String productArea;
                        public String feeManner;
                        public java.util.List<String> sortOrder;
                        public String enableShipping;
                        public String dataMd5;
                        public String isDefault;
                        public String isAppMould;
                        public String description;
                        public String provId;
                        public String provName;
                        public String cityId;
                        public String cityName;
                        public String areaId;
                        public String areaName;
                        public FeeList feeList;

                        public static class FeeList {
                            public RegisterPost registerPost;
                            public Express express;

                            public static class RegisterPost {
                                public boolean enabled;
                                public String name;
                                public java.util.List<Special> special;

                                public static class Special {
                                    public int feeId;
                                    public java.util.List<Area> area;
                                    public String areaDivide;
                                    public int initialNum;
                                    public int addNum;
                                    public String addFee;
                                    public String initialFee;
                                    public String registerFee;

                                    public static class Area {
                                        public String provId;
                                        public String provName;
                                        public java.util.List<?> cities;
                                    }
                                }
                            }

                            public static class Express {
                                public boolean enabled;
                                public String name;
                                public java.util.List<Special> special;

                                public static class Special {
                                    public int feeId;
                                    public java.util.List<Area> area;
                                    public String areaDivide;
                                    public int initialNum;
                                    public int addNum;
                                    public String addFee;
                                    public String initialFee;
                                    public String registerFee;

                                    public static class Area {
                                        public String provId;
                                        public String provName;
                                        public java.util.List<Cities> cities;

                                        public static class Cities {
                                            public String cityId;
                                            public String cityName;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }

            public static class NewMouldInfo {
                public String mouldId;
                public String mouldName;
                public String isTransfer;
                public String isDefault;
                public String isAppMould;
                public String feeManner;
                public String productArea;
                public MouldInfo mouldInfo;

                public static class MouldInfo {
                    public String mouldId;
                    public String userId;
                    public String mouldName;
                    public String productArea;
                    public String feeManner;
                    public java.util.List<String> sortOrder;
                    public String enableShipping;
                    public String dataMd5;
                    public String isDefault;
                    public String isAppMould;
                    public String description;
                    public String provId;
                    public String provName;
                    public String cityId;
                    public String cityName;
                    public String areaId;
                    public String areaName;
                    public FeeList feeList;

                    public static class FeeList {
                        public RegisterPost registerPost;
                        public Express express;

                        public static class RegisterPost {
                            public boolean enabled;
                            public String name;
                            public java.util.List<Special> special;

                            public static class Special {
                                public int feeId;
                                public java.util.List<Area> area;
                                public String areaDivide;
                                public int initialNum;
                                public int addNum;
                                public String addFee;
                                public String initialFee;
                                public String registerFee;

                                public static class Area {
                                    public String provId;
                                    public String provName;
                                    public java.util.List<?> cities;
                                }
                            }
                        }

                        public static class Express {
                            public boolean enabled;
                            public String name;
                            public java.util.List<Special> special;

                            public static class Special {
                                public int feeId;
                                public java.util.List<Area> area;
                                public String areaDivide;
                                public int initialNum;
                                public int addNum;
                                public String addFee;
                                public String initialFee;
                                public String registerFee;

                                public static class Area {
                                    public String provId;
                                    public String provName;
                                    public java.util.List<Cities> cities;

                                    public static class Cities {
                                        public String cityId;
                                        public String cityName;
                                    }
                                }
                            }
                        }
                    }
                }
            }

            public static class DefaultMouldInfo {
                public String mouldId;
                public String mouldName;
                public String isTransfer;
                public String isDefault;
                public String isAppMould;
                public String feeManner;
                public String productArea;
                public MouldInfo mouldInfo;

                public static class MouldInfo {
                    public String mouldId;
                    public String userId;
                    public String mouldName;
                    public String productArea;
                    public String feeManner;
                    public java.util.List<String> sortOrder;
                    public String enableShipping;
                    public String dataMd5;
                    public String isDefault;
                    public String isAppMould;
                    public String description;
                    public String provId;
                    public String provName;
                    public String cityId;
                    public String cityName;
                    public String areaId;
                    public String areaName;
                    public FeeList feeList;

                    public static class FeeList {
                        public RegisterPost registerPost;
                        public Express express;

                        public static class RegisterPost {
                            public boolean enabled;
                            public String name;
                            public java.util.List<Special> special;

                            public static class Special {
                                public int feeId;
                                public java.util.List<Area> area;
                                public String areaDivide;
                                public int initialNum;
                                public int addNum;
                                public String addFee;
                                public String initialFee;
                                public String registerFee;

                                public static class Area {
                                    public String provId;
                                    public String provName;
                                    public java.util.List<?> cities;
                                }
                            }
                        }

                        public static class Express {
                            public boolean enabled;
                            public String name;
                            public java.util.List<Special> special;

                            public static class Special {
                                public int feeId;
                                public java.util.List<Area> area;
                                public String areaDivide;
                                public int initialNum;
                                public int addNum;
                                public String addFee;
                                public String initialFee;
                                public String registerFee;

                                public static class Area {
                                    public String provId;
                                    public String provName;
                                    public java.util.List<Cities> cities;

                                    public static class Cities {
                                        public String cityId;
                                        public String cityName;
                                    }
                                }
                            }
                        }
                    }
                }
            }

            public static class Site {
                public String admin;
                public String adminLogin;
                public String adminMessage;
                public String adminPm;
                public String adminUser;
                public String app;
                public String appPush;
                public String articleimg;
                public String auctionimg;
                public String book;
                public String booklibadmin;
                public String booklibAdmin;
                public String booklib;
                public String bq;
                public String cart;
                public String commonWebdav;
                public String cyx;
                public String dav;
                public String davUpload;
                public String s_davUpload;
                public String help;
                public String shoushu;
                public String home;
                public String hxtx;
                public String imageupload;
                public String imgkey;
                public String imgup;
                public String ims;
                public String itemadmin;
                public String s_itemadmin;
                public String item;
                public String jiaocai;
                public String kfzimg;
                public String kfzsearch;
                public String lib;
                public String library;
                public String m_app;
                public String m_book;
                public String mbook;
                public String mbooklib;
                public String m_booklib;
                public String mbq;
                public String messageAdmin;
                public String message;
                public String messageImgHost;
                public String messageImg;
                public String m_help;
                public String mhelp;
                public String m_message;
                public String mmessage;
                public String mmxj;
                public String m_pm;
                public String mpm;
                public String m_res;
                public String mres;
                public String m_search;
                public String msearch;
                public String m_shop;
                public String mshop;
                public String msite;
                public String m_sms;
                public String m_tan;
                public String m_union;
                public String m_user;
                public String muser;
                public String m_wuliu;
                public String mwww;
                public String m_www;
                public String m_xiaoxi;
                public String mxiaoxi;
                public String m_xinyu;
                public String mxinyu;
                public String m_zixun;
                public String mzixun;
                public String onlinelogin;
                public String operation;
                public String order;
                public String order_interface;
                public String order_service;
                public String payAdmin;
                public String payAdminNew;
                public String pmAdmin;
                public String pmgsAdmin;
                public String pmgs;
                public String pm;
                public String pmimg;
                public String pmpush;
                public String press;
                public String productservice;
                public String productService;
                public String producttask;
                public String recommend;
                public String res;
                public String search;
                public String searchnewimg;
                public String searchService;
                public String newsearchservice;
                public String seller;
                public String service;
                public String shequ;
                public String shequlogin;
                public String shopAdmin;
                public String shop;
                public String shopimg;
                public String shopservice;
                public String shufang;
                public String shx;
                public String sms;
                public String special;
                public String sres;
                public String store;
                public String s_store;
                public String study;
                public String sysncsession;
                public String tanAdmin;
                public String tan;
                public String tanimg;
                public String tejiashu;
                public String tg;
                public String tongji;
                public String tousu2;
                public String tousu;
                public String union;
                public String unionimg;
                public String userAdmin;
                public String userApi;
                public String user;
                public String verify;
                public String wuliu;
                public String www;
                public String xiaoxi;
                public String xinyu2;
                public String xinyuapi;
                public String xinyuApi;
                public String xinyu;
                public String ygxp;
                public String zashuguan;
                public String zhuanti;
                public String zixun;
                public String wechat;
                public String express;
                public String mtopic;
                public String open;
                public String bigdata;
                public String searchfront;
                public String carts;
                public String s_res;
                public String s_res2;
                public String s_cart;
                public String s_user;
                public String s_shop;
                public String s_library;
                public String s_zashuguan;
                public String s_app;
                public String s_bigdata;
                public String s_book;
                public String s_mbook;
                public String s_booklib;
                public String s_seller;
                public String s_selleroperation;
                public String s_download;
                public String s_tan;
                public String s_bq;
                public String s_appdownload;
                public String s_apppackage;
                public String s_tj;
                public String s_cn_tj;
                public String s_www;
                public String s_promotion;
                public String s_m;
                public String s_mshop;
                public String s_msearch;
                public String s_muser;
                public String s_mpay;
                public String mpays;
                public String s_mbq;
                public String s_search;
                public String s_service;
                public String s_qrcode;
                public String s_tousu;
                public String s_help;
                public String s_newhelp;
                public String s_jiaocai;
                public String s_item;
                public String s_imgmanage;
                public String imgmanage;
                public String s_upload;
                public String s_pmgs;
                public String s_pmgsadmin;
                public String s_sms;
                public String s_order;
                public String s_cn_cart;
                public String s_message;
                public String s_cn_message;
                public String s_mmessage;
                public String s_login;
                public String s_cn_login;
                public String s_cn_user;
                public String s_xinyu;
                public String s_xinyuapi;
                public String s_pm;
                public String s_cn_download;
                public String s_mpm;
                public String s_static;
                public String s_pay;
                public String s_express;
                public String s_wechat;
                public String s_img0;
                public String s_user_img;
                public String s_shopimg;
                public String s_photo;
                public String s_video;
                public String s_zsg_img;
                public String s_pmgs_img;
                public String s_booklibimg;
                public String s_cn_img;
                public String s_kfzimg;
                public String s_imageupload;
                public String s_auth;
                public String s_open;
                public String s_t;
                public String t;
                public String social;
                public String s_social;
                public String s_cn_seller;
                public String s_shoushu;
                public String sub;
                public String subs;
                public String s_sub;
                public String cn_sub;
                public String s_cn_sub;
                public String s_operation;
                public String kongpmsysncsession;
                public String gateway;
                public String www_kongpm;
                public String s_www_kongpm;
                public String kongpm;
                public String s_kongpm;
                public String s_m_kongpm;
                public String wss_kongpm;
                public String _self_;
                public String img0;
                public String login;
                public String messages;
                public String im;
                public String s_im;
                public String pay;
                public String res2;
                public String userapi;
                public String pmseller;
                public String m;
                public String mlogin;
                public String mpay;
                public String mtousu;
                public String auctionimgcc;
                public String img1;
                public String img2;
                public String booklibimg;
                public String booklibimg2;
                public String img;
                public String img3;
                public String img4;
                public String img5;
                public String img6;
                public String img7;
                public String img8;
                public String img9;
            }

            public static class MyItemCats {
                public String name;
                public String value;
            }
        }

        public static class List {
            public long itemId;
            public int userId;
            public int bizType;
            public long catId;
            public int myCatId;
            public String itemName;
            public String author;
            public String press;
            public String price;
            public int yearsGroup;
            public String pubDate;
            public Years years;
            public int discount;
            public int number;
            public int isNewBook;
            public int quality;
            public int isOnSale;
            public int beginSaleTime;
            public int endSaleTime;
            public int oriPrice;
            public String itemSn;
            public String isbn;
            public int isRelatedISBN;
            public int isSyncISBN;
            public int booklibId;
            public String imgUrl;
            public String bgImgUrl;
            public int imgShowType;
            public int isBuildIndex;
            public int isDelete;
            public String certifyStatus;
            public int reCertifyStatus;
            public String repeatMd5;
            public int approach;
            public int isDraft;
            public long productArea;
            public String bearShipping;
            public int isUseMould;
            public int mouldId;
            public int weight;
            public int weightPiece;
            public int isPreSale;
            public int preSaleNum;
            public int isFlashSale;
            public int startFlashSaleTime;
            public int endFlashSaleTime;
            public int limitBuyNum;
            public int addTime;
            public String updateTime;
            public Object dynamicTableName;
            public int realPrice;
            public int tpl;
            public java.util.List<String> catNames;
            public String catName;
            public String imgSrc;
            public String imgSrcMiddle;
            public String imgSrcBig;
            public String qualityName;
            public String certifyStatusName;
            public String status;
            public boolean onsale;
            public int shopId;
            public String date;
            public String time;
            public Update update;

            public static class Years {
                public String id;
                public String name;
                public String start;
                public String end;
                public int level;
                public int hasLeaf;
            }

            public static class Update {
                public String date;
                public String time;
            }
        }
    }

    public static class Pager {
    }
}
