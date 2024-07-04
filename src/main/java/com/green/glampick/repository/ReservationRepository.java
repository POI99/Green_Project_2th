package com.green.glampick.repository;

import com.green.glampick.entity.ReservationEntity;
import com.green.glampick.repository.resultset.GetBookResultSet;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReservationRepository extends JpaRepository<ReservationEntity, Long> {

    @Query(
            value =
            "SELECT C.glamp_name AS glampName" +
            ", B.room_name AS roomName" +
            ", A. check_in_date AS checkInDate" +
            ", A. check_out_date AS checkOutDate " +
            ", A. created_at AS createdAt " +
            ", B. check_in_time AS checkInTime " +
            ", B. check_out_time AS checkOutTime " +
            "FROM reservation_before A " +
            "JOIN room B " +
            "ON A.room_id = B.room_id " +
            "JOIN glamping C " +
            "ON B.glamp_id = C.glamp_id " +
            "WHERE A.user_id = :userId " +
            "ORDER BY A.created_at DESC ",
            nativeQuery = true
    )
    List<GetBookResultSet> getBook(Long userId);
}
