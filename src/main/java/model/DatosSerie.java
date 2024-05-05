package model;
import com.fasterxml.jackson.annotation.JsonAlias;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public record DatosSerie(
        @JsonAlias("title") String titulo,
        @JsonAlias("totalSeason") Integer totalTemporadas,
        @JsonAlias("imbRating") String evaluacion) {

}
