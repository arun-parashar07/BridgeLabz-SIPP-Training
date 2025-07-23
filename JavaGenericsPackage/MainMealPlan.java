package JavaGenericsPackage;

public class MainMealPlan {
    public static void main(String[] args) {
        VegetarianMeal veg = new VegetarianMeal();
        VeganMeal vegan = new VeganMeal();

        Meal.generatePlan(veg);
        Meal.generatePlan(vegan);
    }
}
