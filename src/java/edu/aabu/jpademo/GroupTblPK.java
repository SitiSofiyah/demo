/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.aabu.jpademo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.validation.constraints.NotNull;

/**
 *
 * @author webdev
 */
@Embeddable
public class GroupTblPK implements Serializable {
    @Basic(optional = false)
    @NotNull
    @Column(name = "group_no")
    private short groupNo;
    @Basic(optional = false)
    @NotNull
    @Column(name = "group_sub_no1")
    private short groupSubNo1;
    @Basic(optional = false)
    @NotNull
    @Column(name = "group_sub_no")
    private short groupSubNo;

    public GroupTblPK() {
    }

    public GroupTblPK(short groupNo, short groupSubNo1, short groupSubNo) {
        this.groupNo = groupNo;
        this.groupSubNo1 = groupSubNo1;
        this.groupSubNo = groupSubNo;
    }

    public short getGroupNo() {
        return groupNo;
    }

    public void setGroupNo(short groupNo) {
        this.groupNo = groupNo;
    }

    public short getGroupSubNo1() {
        return groupSubNo1;
    }

    public void setGroupSubNo1(short groupSubNo1) {
        this.groupSubNo1 = groupSubNo1;
    }

    public short getGroupSubNo() {
        return groupSubNo;
    }

    public void setGroupSubNo(short groupSubNo) {
        this.groupSubNo = groupSubNo;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) groupNo;
        hash += (int) groupSubNo1;
        hash += (int) groupSubNo;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GroupTblPK)) {
            return false;
        }
        GroupTblPK other = (GroupTblPK) object;
        if (this.groupNo != other.groupNo) {
            return false;
        }
        if (this.groupSubNo1 != other.groupSubNo1) {
            return false;
        }
        if (this.groupSubNo != other.groupSubNo) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.aabu.jpademo.GroupTblPK[ groupNo=" + groupNo + ", groupSubNo1=" + groupSubNo1 + ", groupSubNo=" + groupSubNo + " ]";
    }
    
}
