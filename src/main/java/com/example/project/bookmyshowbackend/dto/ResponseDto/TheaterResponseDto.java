package com.example.project.bookmyshowbackend.dto.ResponseDto;

import com.example.project.bookmyshowbackend.enums.TheaterType;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class TheaterResponseDto {

    int id;
    String name;
    String address;
    String city;
    TheaterType type;
    //Show Entity
}
