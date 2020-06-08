/**
 * @author ww
 * @date 2020/4/27 16:50
 */
public enum EventEnum {
    /**
     * 枚举测试
     */
    LAUNCH("launch"),PAGEVIEW("pageview"),EVENT("event");

    EventEnum(String name) {
        this.name = name;
    }

    private String name;

    public void show(){
        EventEnum[] enums = values();
//        for (int i = 0; i < enums.length; i++) {
//            System.out.println(enums[i]);
//        }
        for (EventEnum anEnum : enums) {
            System.out.println(anEnum);
        }
        System.out.println(this.name);
    }

}
