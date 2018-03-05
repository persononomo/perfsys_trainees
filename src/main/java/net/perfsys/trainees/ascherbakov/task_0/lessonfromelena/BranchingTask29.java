//Поле шахматной доски определяется парой натуральных чисел, каждое из которых не превосходит 8: первое число — номер вертикали (при счете слева направо), второе — номер горизонтали (при счете сверху вниз).
//При решении задач сделать проверку корректности введенных данных: координаты должны быть в диапазоне [1; 8].

//На шахматной доске в клетке с координатами (x1, y1) находится тура (ладья). Определить, сможет ли она одним ходом попасть на клетку (x, y).

package net.perfsys.trainees.ascherbakov.task_0.lessonfromelena;

public class BranchingTask29 {
    public static void main(String[] args) {
        int x1 = 2;
        int y1 = 3;
        int x = 5;
        int y = 6;
        int maxx = Math.max(x1, x);
        int maxy = Math.max(y1, y);
        int minx = Math.min(x1, x);
        int miny = Math.min(y1, y);
        if ((x1 >= 1 && x1 <= 8) && (x >= 1 && x <= 8) && (y1 >= 1 && y1 <= 8) && (y >= 1 && y <= 8)) {
            if (maxx - minx == maxy - miny) System.out.println("Офицер сможет попасть в клетку x,y");
                //  if (Math.abs(x1-x)==Math.abs(y1-y) System.out.println("Офицер сможет попасть в клетку x,y");
            else System.out.println("Не сможет попасть");
        } else System.out.println("Координаты не попадают в необходимый диапазон");
    }
}
