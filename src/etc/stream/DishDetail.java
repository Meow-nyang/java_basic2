package etc.stream;

public class DishDetail {

    private final String djshName;
    private final String type;

    public DishDetail(Dish dish) {
        this.djshName = dish.getName();
        this.type = dish.getType().getDesc();
    }

    @Override
    public String toString() {
        return "DishDetail{" +
                "djshName='" + djshName + '\'' +
                ", type=" + type +
                '}';
    }
}
