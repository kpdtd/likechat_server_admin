package com.likechat.admin.constant;

public interface Constant {
	
	// 服务器存储路径常量
	public static final String SERVER_SAVE_PATH = "SERVER_SAVE_PATH";
	public static final String D_IMG_SAVE_PATH = "D_IMG_SAVE_PATH";
	public static final String D_VIDEO_SAVE_PATH = "D_VIDEO_SAVE_PATH";
	
	public static final String BANNER_TYPE = "BANNER_TYPE";
	public static final String BANNER_TYPE_NOSKIP = "noskip";// 不跳转
	public static final String BANNER_TYPE_WEBSINGLESAVE = "WebSingleSave"; // 跳转html5页面
	public static final String BANNER_TYPE_ANCHORHOME = "AnchorHome";// 跳转主播详情
	public static final String BANNER_TYPE_ACTORCLASS = "AnchorList";//跳转主播分类
	public static final String BANNER_TYPE_VIDEOINFO = "VideoInfo"; // 跳转指定视频
	public static final String BANNER_TYPE_ANCHORRANKINGLIST = "AnchorRankingList"; // 跳转榜单详情
	public static final String BANNER_TYPE_PLAYLISTDETAIL = "PlayListDetail"; // 跳转播单详情
	/******** menu管理 *********/
	public static final String MENU_INDEX = "index";
	
	public static final String MENU_MESSAGE_BANNER = "banner";
	public static final String MENU_MESSAGE_CLASSIFY = "classify";
	public static final String MENU_MESSAGE_POPLIVE = "popLive";// 热门直播
	public static final String MENU_MESSAGE_DAILYRECOMMEND = "dailyRecommend"; // 每日推荐
	public static final String MENU_MESSAGE_TOPLIST = "topList"; // 排行榜
	
	public static final String MENU_MESSAGE_EXQUISITEVIDEO = "exquisiteVideo"; // 精品视频
	public static final String MENU_MESSAGE_EXQUISITEACTOR = "exquisiteActor"; // 推荐主播
	public static final String MENU_MESSAGE_EXQUISITEORDER = "exquisiteOrder"; // 精品播单
	
	public static final String MENU_MESSAGE_LIVECHANNEL = "liveChannel"; // 直播频道
	public static final String MENU_MESSAGE_ORDERMANAGE = "orderManage"; // 播单管理
	
	public static final String MENU_OPERATION_ACTOR = "actor"; // 主播库
	public static final String MENU_OPERATION_VIDEO = "video"; // 视频库
	public static final String MENU_OPERATION_ORDER = "order"; // 播单库
	public static final String MENU_OPERATION_TAG = "tag"; // 标签库
	public static final String MENU_OPERATION_RANKINGLIST_ACTOR = "rankinglist_actor"; // 榜单管理
	public static final String MENU_OPERATION_RANKINGLIST_VIDEO = "rankinglist_video"; // 播单管理
	public static final String MENU_OPERATION_COMMENT = "comment"; // 评论管理
	public static final String MENU_OPERATION_COLUMN = "column"; // 评论管理
	public static final String MENU_OPERATION_USER = "user"; // 用户管理
	public static final String MENU_MESSAGE_SYSTEM = "systemMsg"; // 用户管理
	
	public static final String MENU_SYSTEM_DICTIONARY = "dictionary"; // 数据字典
	
	/******** 频道管理 *********/
	//人工规则
    public static final String R_WORKER_DO="R_WORKER_DO";//人工
    //1.1 banner区域
    public static final String C_SPECIAL_BANNER="C_SPECIAL_BANNER";
    //1.2 分类区域
    public static final String C_SPECIAL_CLASSIFY="C_SPECIAL_CLASSIFY";
    //推荐主播(推荐列表6个主播)
    public static final String C_ACTOR_RECOMMEND="C_ACTOR_RECOMMEND";
    //1.3 精品视频(推荐列表)
    public static final String C_VIDEO_RECOMMEND="C_VIDEO_RECOMMEND";
    //1.5精品播单
    public static final String C_BOUTIQUE_VIDEO="C_BOUTIQUE_VIDEO";//boutique
    
    //3.1主播分类标签
    public static final String C_LIVE_CLASSIFY="C_LIVE_CLASSIFY";
    //主播推荐列表
    public static final String C_LIVE_ACTOR_RECOMMEND="C_LIVE_ACTOR_RECOMMEND";
	
	public static final String VIDEO_MODE_TYPE_DO_WORKER = "1";// 人工录制
	public static final String VIDEO_MODE_TYPE_DO_SPIDER = "2";// 后台抓取
	
}
