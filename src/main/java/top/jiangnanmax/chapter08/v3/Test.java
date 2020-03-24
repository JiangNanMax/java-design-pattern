package top.jiangnanmax.chapter08.v3;

import java.util.Iterator;

/**
 * @author jiangnan
 * @description Test
 * @date 2020/3/24
 **/

public class Test {

    public static void main(String[] args) {
        ComputerCollege computerCollege = new ComputerCollege("计算机学院", 5);
        InfoCollege infoCollege = new InfoCollege("信息学院");

        computerCollege.addDepartment("computer01", "computer01");
        computerCollege.addDepartment("computer02", "computer02");
        computerCollege.addDepartment("computer03", "computer03");
        infoCollege.addDepartment("info01", "info01");
        infoCollege.addDepartment("info02", "info02");
        infoCollege.addDepartment("info03", "info03");

        Iterator iterator = computerCollege.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println("-----------------------");
        iterator = infoCollege.createIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }

}
