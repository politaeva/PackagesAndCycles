import ru.netology.gamid.PackagesAndCycles.services.Calculate;

public class Main {

    public static void main(String[] args) {

        Calculate service = new Calculate();

        int calculate = service.calculate(300, 300, 300);
        System.out.println(calculate);
    }
}
