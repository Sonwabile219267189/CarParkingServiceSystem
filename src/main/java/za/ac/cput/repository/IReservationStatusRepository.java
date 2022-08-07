package za.ac.cput.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import za.ac.cput.entity.ReservationStatus;

public interface IReservationStatusRepository extends JpaRepository<ReservationStatus, String> {
}
