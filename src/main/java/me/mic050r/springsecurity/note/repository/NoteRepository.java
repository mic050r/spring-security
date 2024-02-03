package me.mic050r.springsecurity.note.repository;

import me.mic050r.springsecurity.note.entity.Note;
import me.mic050r.springsecurity.user.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface NoteRepository extends JpaRepository<Note, Long> {

    List<Note> findByUserOrderByIdDesc(User user);

    Note findByIdAndUser(Long id, User user);
}