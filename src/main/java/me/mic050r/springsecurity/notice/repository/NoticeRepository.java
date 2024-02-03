package me.mic050r.springsecurity.notice.repository;

import me.mic050r.springsecurity.notice.entity.Notice;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoticeRepository extends JpaRepository<Notice, Long> {
}