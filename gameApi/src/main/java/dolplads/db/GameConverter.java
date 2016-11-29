package dolplads.db;

import dolplads.api.GameDto;
import dolplads.core.Game;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

/**
 * Created by dolplads on 28/11/2016.
 */
public class GameConverter {
    public static GameDto transform(Game game) {
        Objects.requireNonNull(game);
        GameDto dto = new GameDto();

        return dto;
    }

    public static List<GameDto> transform(List<Game> games) {
        Objects.requireNonNull(games);

        return games.stream()
                .map(GameConverter::transform)
                .collect(Collectors.toList());
    }
}
