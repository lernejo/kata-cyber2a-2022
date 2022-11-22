import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Launcher {

    public static void main(String[] args) throws InterruptedException {
        if(args.length < 2) {
            throw new IllegalArgumentException("Should pass 2 arguments, col & lines");
        }
        int cols = Integer.parseInt(args[0]);
        int lines = Integer.parseInt(args[1]);

        String initialPopulation = IntStream.range(0, lines)
            .mapToObj(i -> ".".repeat(cols))
            .collect(Collectors.joining("\n"));
        var gol = new GameOfLife(initialPopulation);
        String population = initialPopulation;
        while(true) {
            System.out.println(population);
            TimeUnit.SECONDS.sleep(1L);
            System.out.print(String.format("\033[2J"));
            population = gol.nextGeneration();
        }
    }
}
