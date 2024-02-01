package com.test1;

public class CodeAnalysis {
	private Integer appCode;
	private Integer dependencyList;
	private String thirdPartyList;
	private String openSourceLib;
	private String vulnerabiities;
	private String dataFlowTrace;
	private boolean taintAnalysis;
	private String findBugsPlugin;
	private String comprehensiveRule;
	private String cloudDetection;
	private String securityHotspots;
	private String issueDescription;
	private String codeHighlights;
	private String fileSystem;

	public CodeAnalysis() {

	}

	public CodeAnalysis(Integer appCode, Integer dependencyList, String thirdPartyList, String openSourceLib,
			String vulnerabiities, String dataFlowTrace, boolean taintAnalysis, String findBugsPlugin,
			String comprehensiveRule, String cloudDetection, String securityHotspots, String issueDescription,
			String codeHighlights, String fileSystem) {
		super();
		this.appCode = appCode;
		this.dependencyList = dependencyList;
		this.thirdPartyList = thirdPartyList;
		this.openSourceLib = openSourceLib;
		this.vulnerabiities = vulnerabiities;
		this.dataFlowTrace = dataFlowTrace;
		this.taintAnalysis = taintAnalysis;
		this.findBugsPlugin = findBugsPlugin;
		this.comprehensiveRule = comprehensiveRule;
		this.cloudDetection = cloudDetection;
		this.securityHotspots = securityHotspots;
		this.issueDescription = issueDescription;
		this.codeHighlights = codeHighlights;
		this.fileSystem = fileSystem;
	}

	public Integer getAppCode() {
		return appCode;
	}

	public void setAppCode(Integer appCode) {
		this.appCode = appCode;
	}

	public Integer getDependencyList() {
		return dependencyList;
	}

	public void setDependencyList(Integer dependencyList) {
		this.dependencyList = dependencyList;
	}

	public String getThirdPartyList() {
		return thirdPartyList;
	}

	public void setThirdPartyList(String thirdPartyList) {
		this.thirdPartyList = thirdPartyList;
	}

	public String getOpenSourceLib() {
		return openSourceLib;
	}

	public void setOpenSourceLib(String openSourceLib) {
		this.openSourceLib = openSourceLib;
	}

	public String getVulnerabiities() {
		return vulnerabiities;
	}

	public void setVulnerabiities(String vulnerabiities) {
		this.vulnerabiities = vulnerabiities;
	}

	public String getDataFlowTrace() {
		return dataFlowTrace;
	}

	public void setDataFlowTrace(String dataFlowTrace) {
		this.dataFlowTrace = dataFlowTrace;
	}

	public boolean isTaintAnalysis() {
		return taintAnalysis;
	}

	public void setTaintAnalysis(boolean taintAnalysis) {
		this.taintAnalysis = taintAnalysis;
	}

	public String getFindBugsPlugin() {
		return findBugsPlugin;
	}

	public void setFindBugsPlugin(String findBugsPlugin) {
		this.findBugsPlugin = findBugsPlugin;
	}

	public String getComprehensiveRule() {
		return comprehensiveRule;
	}

	public void setComprehensiveRule(String comprehensiveRule) {
		this.comprehensiveRule = comprehensiveRule;
	}

	public String getCloudDetection() {
		return cloudDetection;
	}

	public void setCloudDetection(String cloudDetection) {
		this.cloudDetection = cloudDetection;
	}

	public String getSecurityHotspots() {
		return securityHotspots;
	}

	public void setSecurityHotspots(String securityHotspots) {
		this.securityHotspots = securityHotspots;
	}

	public String getIssueDescription() {
		return issueDescription;
	}

	public void setIssueDescription(String issueDescription) {
		this.issueDescription = issueDescription;
	}

	public String getCodeHighlights() {
		return codeHighlights;
	}

	public void setCodeHighlights(String codeHighlights) {
		this.codeHighlights = codeHighlights;
	}

	public String getFileSystem() {
		return fileSystem;
	}

	public void setFileSystem(String fileSystem) {
		this.fileSystem = fileSystem;
	}

}
