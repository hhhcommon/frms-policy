package cn.com.bsfit.frms.policy.pojo;

import java.io.Serializable;

public class Risks implements Serializable {
    private Long id;

    private Long archivesId;

    private String ruleName;

    private Long score;

    private String comments;

    private String rulePackageName;

    private String ruleId;

    private static final long serialVersionUID = 1L;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getArchivesId() {
        return archivesId;
    }

    public void setArchivesId(Long archivesId) {
        this.archivesId = archivesId;
    }

    public String getRuleName() {
        return ruleName;
    }

    public void setRuleName(String ruleName) {
        this.ruleName = ruleName == null ? null : ruleName.trim();
    }

    public Long getScore() {
        return score;
    }

    public void setScore(Long score) {
        this.score = score;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments == null ? null : comments.trim();
    }

    public String getRulePackageName() {
        return rulePackageName;
    }

    public void setRulePackageName(String rulePackageName) {
        this.rulePackageName = rulePackageName == null ? null : rulePackageName.trim();
    }

    public String getRuleId() {
        return ruleId;
    }

    public void setRuleId(String ruleId) {
        this.ruleId = ruleId == null ? null : ruleId.trim();
    }

    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        Risks other = (Risks) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getArchivesId() == null ? other.getArchivesId() == null : this.getArchivesId().equals(other.getArchivesId()))
            && (this.getRuleName() == null ? other.getRuleName() == null : this.getRuleName().equals(other.getRuleName()))
            && (this.getScore() == null ? other.getScore() == null : this.getScore().equals(other.getScore()))
            && (this.getComments() == null ? other.getComments() == null : this.getComments().equals(other.getComments()))
            && (this.getRulePackageName() == null ? other.getRulePackageName() == null : this.getRulePackageName().equals(other.getRulePackageName()))
            && (this.getRuleId() == null ? other.getRuleId() == null : this.getRuleId().equals(other.getRuleId()));
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getArchivesId() == null) ? 0 : getArchivesId().hashCode());
        result = prime * result + ((getRuleName() == null) ? 0 : getRuleName().hashCode());
        result = prime * result + ((getScore() == null) ? 0 : getScore().hashCode());
        result = prime * result + ((getComments() == null) ? 0 : getComments().hashCode());
        result = prime * result + ((getRulePackageName() == null) ? 0 : getRulePackageName().hashCode());
        result = prime * result + ((getRuleId() == null) ? 0 : getRuleId().hashCode());
        return result;
    }
}