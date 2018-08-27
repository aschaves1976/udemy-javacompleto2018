package entities;

public class Student {
	String name;
	String status;
	static final String FAILED_STATUS = "FAILED";
	static final String PASS_STATUS = "PASS";
	double finalScore;
	double missingScore;

	Quarter score = new Quarter();

	public void setScore(double score, int quarter) {
		switch (quarter) {
		case 1:
			this.score.firstQuarter = score;
			break;
		case 2:
			this.score.secondQuarter = score;
			break;
		case 3:
			this.score.thirdQuarter = score;
			break;
		}
		setFinalScore(this.score.getFirstQuarter() + this.score.getSecondQuarter() + this.score.getThirdQuarter());
		setStatus();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getFinalScore() {
		return finalScore;
	}

	public void setFinalScore(Double finalScore) {
		this.finalScore = finalScore;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus() {
		if (getFinalScore() > 60.00) {
			this.status = PASS_STATUS;
		} else {
			this.status = FAILED_STATUS;
			setMissingScore();
		}
	}

	public void setMissingScore() {
		this.missingScore = 60.00 - this.getFinalScore();

	}

	public double getMissingScore() {
		return this.missingScore;
	}

	public String toString() {
		return this.status.equals(PASS_STATUS)
				? String.format("FINAL GRADE: %.2f%n%s%n", this.getFinalScore(), this.status)
				: String.format("FINAL GRADE: %.2f%n%s%nMISSING: %.2f POINTS", this.getFinalScore(), this.status,
						getMissingScore());

	}

}
