package cn.sudiyi.platform.model.request;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Created by pktczwd on 2016/11/15.
 */
public class AddCourierMobileRequest {

    @JsonProperty("reservation_id")
    private Long reservationId;
    @JsonProperty("courier_mobile")
    private String courierMobile;

    public Long getReservationId() {
        return reservationId;
    }

    public void setReservationId(Long reservationId) {
        this.reservationId = reservationId;
    }

    public String getCourierMobile() {
        return courierMobile;
    }

    public void setCourierMobile(String courierMobile) {
        this.courierMobile = courierMobile;
    }
}
