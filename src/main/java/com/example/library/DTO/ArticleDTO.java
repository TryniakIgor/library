package com.example.library.DTO;

import com.example.library.model.Color;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ArticleDTO {
    private int id;
    private String text;
    private Color color;
}
