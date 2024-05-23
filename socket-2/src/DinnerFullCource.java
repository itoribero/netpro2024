public class DinnerFullCource {
    private Dish[] list = new Dish[5];// [0]-[4]の計5個

    public static void main(String[] args) {

        DinnerFullCource fullcource = new DinnerFullCource();
        fullcource.eatAll();
    }

    void eatAll() {
        String str = "";
        for (Dish element : list) {
            str += element.getName() + "=" + element.getValune() + ">";
            
        }
        System.out.println("たかしへ、ママ２です?J( 'ｰ`)し 今日の晩御飯コースは" + str + "よ");
    }

    DinnerFullCource() {
        for (int i = 0; i < list.length; i++) {
            list[i] = new Dish();
        }

        list[0].setName("味噌汁");
        list[0].setValune(10);

        list[1].setName("ご飯");
        list[1].setValune(20);

        list[2].setName("鮭の塩焼き");
        list[2].setValune(30);

        list[3].setName("納豆");
        list[3].setValune(40);

        list[4].setName("玉子焼き");
        list[4].setValune(50);
    }
}
