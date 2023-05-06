package UI;

import java.util.List;
import java.util.Scanner;

import Configs.Config;
import Core.MVP.View;
import Core.Models.Toy;

public class ConsoleView implements View {
    Scanner in;

    public ConsoleView() {
        in = new Scanner(System.in);
    }

    @Override
    public int getToyId() {
        System.out.print("Id игрушки: ");
        return Integer.parseInt(in.nextLine());
    }

    @Override
    public String getToyNaming() {
        System.out.print("Название игрушки: ");
        return in.nextLine();
    }

    @Override
    public int getToyWeight() {
        System.out.print("Вес игрушки: ");
        return Integer.parseInt(in.nextLine());
    }
/**
    @Override
    public void setToyWeight(int value) {
        System.out.printf("Вес игрушки: %s\n", value);
    }
*/
    @Override
    public void showAll(List<Toy> toys) {
        System.out.println("\nВсе игрушки:");
        for (Toy toy : toys) {
            System.out.println(toy);
        }

    }

    @Override
    public void showGetToy(Toy toy) {
        System.out.print("\nРезультаты жеребьёвки: ");
        System.out.println(toy);
    }

    @Override
    public void loadMessage() {
        System.out.println("\nFile is loaded to current session");
    }

    @Override
    public boolean clearAllDecision() {
        boolean f = false;
        System.out.print("\nВы уверены, что хотите очистить все записи (y/n): ");
        if (in.nextLine().equalsIgnoreCase("Y")) {
            f = true;
        }
        return f;
    }

    @Override
    public void savedAll() {
        System.out.println("\nВсё сохраняется в файл: " + Config.pathDb);
    }

    @Override
    public void savedItem() {
        System.out.println("\nУспешно добавлено");
    }

    @Override
    public void saveError() {
        System.out.println("\nНе удалось добавить");
    }

    @Override
    public void emptyListMessage() {
        System.out.println("Список игрушек пуст");
    }

    @Override
    public int getDrawTimes() {
        System.out.print("Сколько раз вы хотите выиграть: ");
        return Integer.parseInt(in.nextLine());
    }

}