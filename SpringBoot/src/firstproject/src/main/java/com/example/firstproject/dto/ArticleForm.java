package com.example.firstproject.dto;

import com.example.firstproject.entity.Article;
import lombok.AllArgsConstructor;
import lombok.ToString;

@AllArgsConstructor //생성자 자동으로 만들어짐
@ToString
public class ArticleForm {
    private String title;
    private String content;


    public Article toEntity() {
        return new Article(null, title, content);
    }
}
