package category;

import product.Price;

public class Electronics implements Price {
    private int sal;

    public void setSal(int sal) {
        this.sal = sal;
    }
    @Override
    public double getPrice() {
        return sal*.05;

    }
}
