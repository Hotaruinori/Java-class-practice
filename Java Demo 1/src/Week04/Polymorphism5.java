package Week04;

import java.util.Scanner;

public class Polymorphism5 {
    public static void main(String[] args) {
        System.out.println("請輸入1 or 2 or 3 的代號:");

        // 使用 try-with-resources 自动关闭 Scanner
        try (Scanner sc = new Scanner(System.in)) {
            String s = sc.next();

            // 晚綁定
            A a = null;

            // 输入验证
            if (s.equals("1")) {
                a = new B();
            } else if (s.equals("2")) {
                a = new C();
            } else if (s.equals("3")) {
                a = new D();
            } else {
                System.out.println("輸入無效，謝謝光臨!");
                return;
            }

            // 调用方法
            a.method();
        } catch (Exception e) {
            System.out.println("發生錯誤: " + e.getMessage());
        }
    }
}

class A {
    public void method() {
        System.out.println("A");
    }
}

class B extends A {
    @Override
    public void method() {
        System.out.println("B");
    }
}

class C extends A {
    @Override
    public void method() {
        System.out.println("C");
    }
}

class D extends A {
    @Override
    public void method() {
        System.out.println("D");
    }
}
/*
 推荐在重写父类或接口方法时加上 @Override，因为它可以：

提供编译时检查，避免错误。

提高代码的可读性和维护性。

防止意外定义新方法而非重写。

符合 Java 编程规范。

这是一种良好的编程习惯，尤其是在大型项目中，能够显著减少错误并提高代码质量。
 */