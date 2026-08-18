import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class AppointmentScheduler {
    
    public LocalDateTime schedule(String appointmentDateDescription) {
        DateTimeFormatter parser = DateTimeFormatter.ofPattern("M/d/yyyy HH:mm:ss");
        return LocalDateTime.parse(appointmentDateDescription, parser);
    }

    public boolean hasPassed(LocalDateTime appointmentDate) {
        return appointmentDate.isBefore(LocalDateTime.now());
    }

    public boolean isAfternoonAppointment(LocalDateTime appointmentDate) {
        return appointmentDate.getHour() >= 12 && appointmentDate.getHour() < 18;
    }

    public String getDescription(LocalDateTime appointmentDate) {
        return DateTimeFormatter.ofPattern("'You have an appointment on 'EEEE, MMMM d, yyyy', at 'h:mm a'.'").format(appointmentDate);
    }

    public LocalDate getAnniversaryDate() {
        LocalDate anniversaryDate = LocalDate.of(LocalDate.now().getYear(), 9, 15);
        return anniversaryDate;
    }
}
