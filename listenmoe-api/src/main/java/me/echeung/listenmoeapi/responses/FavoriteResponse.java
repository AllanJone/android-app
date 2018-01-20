package me.echeung.listenmoeapi.responses;

import java.util.List;

import lombok.Getter;
import me.echeung.listenmoeapi.models.Song;

@Getter
public class FavoriteResponse extends BaseResponse {
    private List<Song> favorites;
}
