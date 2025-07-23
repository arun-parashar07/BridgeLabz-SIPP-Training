package JavaGenericsPackage;

interface MealPlan {
    String getPlanDetails();
}

class VegetarianMeal implements MealPlan {
    public String getPlanDetails() {
        return "Vegetarian Meal Plan";
    }
}

class VeganMeal implements MealPlan {
    public String getPlanDetails() {
        return "Vegan Meal Plan";
    }
}

class KetoMeal implements MealPlan {
    public String getPlanDetails() {
        return "Keto Meal Plan";
    }
}

class Meal<T extends MealPlan> {
    private T plan;
    public Meal(T plan) {
        this.plan = plan;
    }

    public T getPlan() {
        return plan;
    }

    public static <T extends MealPlan> void generatePlan(T plan) {
        System.out.println("Generated: " + plan.getPlanDetails());
    }
}
