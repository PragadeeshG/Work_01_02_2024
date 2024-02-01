package com.test1;

public class SonarCheck {
	private String sonarQube;
	private String codeQuality;
	private String languages;
	private String platforms;
	private String devOpsIntegeration;
	private String qualityGate;
	private String highOperability;
	private Integer fastAnalysis;
	private String rules;
	private String ideIntegeration;
	private String sharedConfig;

	public SonarCheck() {

	}

	public SonarCheck(String sonarQube, String codeQuality, String languages, String platforms,
			String devOpsIntegeration, String qualityGate, String highOperability, Integer fastAnalysis, String rules,
			String ideIntegeration, String sharedConfig) {
		super();
		this.sonarQube = sonarQube;
		this.codeQuality = codeQuality;
		this.languages = languages;
		this.platforms = platforms;
		this.devOpsIntegeration = devOpsIntegeration;
		this.qualityGate = qualityGate;
		this.highOperability = highOperability;
		this.fastAnalysis = fastAnalysis;
		this.rules = rules;
		this.ideIntegeration = ideIntegeration;
		this.sharedConfig = sharedConfig;
	}

	public String getSonarQube() {
		return sonarQube;
	}

	public void setSonarQube(String sonarQube) {
		this.sonarQube = sonarQube;
	}

	public String getCodeQuality() {
		return codeQuality;
	}

	public void setCodeQuality(String codeQuality) {
		this.codeQuality = codeQuality;
	}

	public String getLanguages() {
		return languages;
	}

	public void setLanguages(String languages) {
		this.languages = languages;
	}

	public String getPlatforms() {
		return platforms;
	}

	public void setPlatforms(String platforms) {
		this.platforms = platforms;
	}

	public String getDevOpsIntegeration() {
		return devOpsIntegeration;
	}

	public void setDevOpsIntegeration(String devOpsIntegeration) {
		this.devOpsIntegeration = devOpsIntegeration;
	}

	public String getQualityGate() {
		return qualityGate;
	}

	public void setQualityGate(String qualityGate) {
		this.qualityGate = qualityGate;
	}

	public String getHighOperability() {
		return highOperability;
	}

	public void setHighOperability(String highOperability) {
		this.highOperability = highOperability;
	}

	public Integer getFastAnalysis() {
		return fastAnalysis;
	}

	public void setFastAnalysis(Integer fastAnalysis) {
		this.fastAnalysis = fastAnalysis;
	}

	public String getRules() {
		return rules;
	}

	public void setRules(String rules) {
		this.rules = rules;
	}

	public String getIdeIntegeration() {
		return ideIntegeration;
	}

	public void setIdeIntegeration(String ideIntegeration) {
		this.ideIntegeration = ideIntegeration;
	}

	public String getSharedConfig() {
		return sharedConfig;
	}

	public void setSharedConfig(String sharedConfig) {
		this.sharedConfig = sharedConfig;
	}

}
