import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class GameOfLifeTest {
    @Test
    void dead_population_do_not_evolve() {
        var initialPopulation = """
            ........
            ....*...
            ...**...
            ........
            """;
        var gol = new GameOfLife(initialPopulation);

        String nextGeneration = gol.nextGeneration();

        Assertions.assertThat(nextGeneration)
            .hasLineCount(4);
    }
}
