package top.jiangnanmax.chapter04.v3;

/**
 * @author jiangnan
 * @description Product
 * @date 2020/2/10
 **/

public class Product {
    private final String productName;
    private final String companyName;
    private final String part;

    public Product(String productName, String companyName, String part) {
        this.productName = productName;
        this.companyName = companyName;
        this.part = part;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", companyName='" + companyName + '\'' +
                ", part='" + part + '\'' +
                '}';
    }

    static class Builder {
        private String productName;
        private String companyName;
        private String part;

        public Builder productName(String productName) {
            this.productName = productName;
            return this;
        }

        public Builder companyName(String companyName) {
            this.companyName = companyName;
            return this;
        }

        public Builder part(String part) {
            this.part = part;
            return this;
        }

        public Product build() {
            // ... 进行相关的验证工作等
            return new Product(this.productName, this.companyName, this.part);
        }

    }
}
