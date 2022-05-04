package train_ticket_booking__app.model;

public class DisplayTrain {
	private Integer id;
	private String trainName;
	private String trainFrom;
	private String trainTo;
	
	private String trainTiming;
	private int trainRate;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTrainName() {
		return trainName;
	}
	public void setTrainName(String trainName) {
		this.trainName = trainName;
	}
	public String getTrainFrom() {
		return trainFrom;
	}
	public void setTrainFrom(String trainFrom) {
		this.trainFrom = trainFrom;
	}
	public String getTrainTo() {
		return trainTo;
	}
	public void setTrainTo(String trainTo) {
		this.trainTo = trainTo;
	}
	public String getTrainTiming() {
		return trainTiming;
	}
	public void setTrainTiming(String trainTiming) {
		this.trainTiming = trainTiming;
	}
	public int getTrainRate() {
		return trainRate;
	}
	public void setTrainRate(int trainRate) {
		this.trainRate = trainRate;
	}
	@Override
	public String toString() {
		return "DisplayTrain [id=" + id + ", trainName=" + trainName + ", trainFrom=" + trainFrom + ", trainTo="
				+ trainTo + ", trainTiming=" + trainTiming + ", trainRate=" + trainRate + "]";
	}


}
