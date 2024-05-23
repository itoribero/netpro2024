public class DinnerFullCource {
    private Dish[] list = new Dish[5];// [0]-[4]の計5個

	public static void main(String[] args) {

		DinnerFullCource fullcource = new DinnerFullCource();
		fullcource.eatAll();
	}

    private void eatAll(){
        for (Dish dish : list) {
            System.out.println(dish.getName() + "=" + dish.getValune() + ","); 
        }
    }

    DinnerFullCource(){
        for(int i = 0; i < list.length; i++){
            list[i] = new Dish();
        }

        list[0].setName("a");
        list[0].setValune(10);

        list[1].setName("b");
        list[1].setValune(20);

        list[2].setName("c");
        list[2].setValune(30);

        list[3].setName("d");
        list[3].setValune(40);

        list[4].setName("e");
        list[4].setValune(50);
    }
}
