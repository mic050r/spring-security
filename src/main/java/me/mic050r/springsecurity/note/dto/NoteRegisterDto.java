package me.mic050r.springsecurity.note.dto;

import lombok.Getter;
import lombok.Setter;

// 노트 등록 dto
@Getter
@Setter
public class NoteRegisterDto {
    private String title;
    private String content;
}