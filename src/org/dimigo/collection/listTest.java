    package org.dimigo.collection;

    import org.dimigo.inheritance.Dog;

    import java.util.ArrayList;
    import java.util.List;

    public class listTest {
        public static void main(String[] args) {
            List<String> list = new ArrayList<>();
            list.add(0, "사과");
            list.add(1, "포도");
            list.add(2, "바나나");
            list.add(3, "딸기");
            list.add(4, "딸기");
            printlist(list);

            System.out.println(list.get(0));
            System.out.println(list.get(list.size() - 1));

            list.remove(0 );
            printlist(list);

            list.remove("딸기");
            printlist(list);

            list.clear();
            printlist(list);
        }

        private static void printlist(List<String> list) {
            for(String value : list) {
                System.out.println(value + " | ");
            }
            System.out.println();
        }
    }
