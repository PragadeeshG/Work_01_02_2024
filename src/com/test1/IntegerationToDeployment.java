package com.test1;

public class IntegerationToDeployment {
	private Integer pipelineId;
	private String buildTemplate;
	private boolean sonarStepsAdded;
	private Integer coverageMeasure;
	private String nexusBuild;
	private String waxScan;
	private Integer nexusIssues;
	private Integer sonarIssues;
	private String securitySummary;
	private Integer findbugsIssues;
	private String gitleaksReport;
	private String remarks;

	public IntegerationToDeployment() {

	}

	public IntegerationToDeployment(Integer pipelineId, String buildTemplate, boolean sonarStepsAdded,
			Integer coverageMeasure, String nexusBuild, String waxScan, Integer nexusIssues, Integer sonarIssues,
			String securitySummary, Integer findbugsIssues, String gitleaksReport, String remarks) {
		super();
		this.pipelineId = pipelineId;
		this.buildTemplate = buildTemplate;
		this.sonarStepsAdded = sonarStepsAdded;
		this.coverageMeasure = coverageMeasure;
		this.nexusBuild = nexusBuild;
		this.waxScan = waxScan;
		this.nexusIssues = nexusIssues;
		this.sonarIssues = sonarIssues;
		this.securitySummary = securitySummary;
		this.findbugsIssues = findbugsIssues;
		this.gitleaksReport = gitleaksReport;
		this.remarks = remarks;
	}

	public Integer getPipelineId() {
		return pipelineId;
	}

	public void setPipelineId(Integer pipelineId) {
		this.pipelineId = pipelineId;
	}

	public String getBuildTemplate() {
		return buildTemplate;
	}

	public void setBuildTemplate(String buildTemplate) {
		this.buildTemplate = buildTemplate;
	}

	public boolean isSonarStepsAdded() {
		return sonarStepsAdded;
	}

	public void setSonarStepsAdded(boolean sonarStepsAdded) {
		this.sonarStepsAdded = sonarStepsAdded;
	}

	public Integer getCoverageMeasure() {
		return coverageMeasure;
	}

	public void setCoverageMeasure(Integer coverageMeasure) {
		this.coverageMeasure = coverageMeasure;
	}

	public String getNexusBuild() {
		return nexusBuild;
	}

	public void setNexusBuild(String nexusBuild) {
		this.nexusBuild = nexusBuild;
	}

	public String getWaxScan() {
		return waxScan;
	}

	public void setWaxScan(String waxScan) {
		this.waxScan = waxScan;
	}

	public Integer getNexusIssues() {
		return nexusIssues;
	}

	public void setNexusIssues(Integer nexusIssues) {
		this.nexusIssues = nexusIssues;
	}

	public Integer getSonarIssues() {
		return sonarIssues;
	}

	public void setSonarIssues(Integer sonarIssues) {
		this.sonarIssues = sonarIssues;
	}

	public String getSecuritySummary() {
		return securitySummary;
	}

	public void setSecuritySummary(String securitySummary) {
		this.securitySummary = securitySummary;
	}

	public Integer getFindbugsIssues() {
		return findbugsIssues;
	}

	public void setFindbugsIssues(Integer findbugsIssues) {
		this.findbugsIssues = findbugsIssues;
	}

	public String getGitleaksReport() {
		return gitleaksReport;
	}

	public void setGitleaksReport(String gitleaksReport) {
		this.gitleaksReport = gitleaksReport;
	}

	public String getRemarks() {
		return remarks;
	}

	public void setRemarks(String remarks) {
		this.remarks = remarks;
	}

}
