public class Vector {
    double xComponent;
    double yComponent;

    public Vector(double x, double y) {
        xComponent = x;
        yComponent = y;
    }

    public double getMagnitude() {
        return Math.sqrt((xComponent * xComponent) + (yComponent * yComponent));
    }

    public Vector add(Vector x) {
        return new Vector((x.xComponent + this.xComponent), (x.yComponent + this.yComponent));
    }

    public Vector multiply(double multiplier) {
        return new Vector((this.xComponent * multiplier), (this.yComponent * multiplier));
    }

    public double dotProduct(Vector product) {
        return ((this.xComponent * product.xComponent) + (this.yComponent * product.yComponent));
    }

    public String toString() {
        return String.format("v = (%.2f, %.2f)", this.xComponent, this.yComponent);
    }
}
