/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.aabu.jpademo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author webdev
 */
@Entity
@Table(name = "group_tbl")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "GroupTbl.findAll", query = "SELECT g FROM GroupTbl g"),
    @NamedQuery(name = "GroupTbl.findByArabicGroupName", query = "SELECT g FROM GroupTbl g WHERE g.arabicGroupName = :arabicGroupName"),
    @NamedQuery(name = "GroupTbl.findByGroupName", query = "SELECT g FROM GroupTbl g WHERE g.groupName = :groupName"),
    @NamedQuery(name = "GroupTbl.findByGroupNo", query = "SELECT g FROM GroupTbl g WHERE g.groupTblPK.groupNo = :groupNo"),
    @NamedQuery(name = "GroupTbl.findByGroupSubNo1", query = "SELECT g FROM GroupTbl g WHERE g.groupTblPK.groupSubNo1 = :groupSubNo1"),
    @NamedQuery(name = "GroupTbl.findByGroupSubNo", query = "SELECT g FROM GroupTbl g WHERE g.groupTblPK.groupSubNo = :groupSubNo")})
public class GroupTbl implements Serializable {
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected GroupTblPK groupTblPK;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "arabic_group_name")
    private String arabicGroupName;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 60)
    @Column(name = "group_name")
    private String groupName;

    public GroupTbl() {
    }

    public GroupTbl(GroupTblPK groupTblPK) {
        this.groupTblPK = groupTblPK;
    }

    public GroupTbl(GroupTblPK groupTblPK, String arabicGroupName, String groupName) {
        this.groupTblPK = groupTblPK;
        this.arabicGroupName = arabicGroupName;
        this.groupName = groupName;
    }

    public GroupTbl(short groupNo, short groupSubNo1, short groupSubNo) {
        this.groupTblPK = new GroupTblPK(groupNo, groupSubNo1, groupSubNo);
    }

    public GroupTblPK getGroupTblPK() {
        return groupTblPK;
    }

    public void setGroupTblPK(GroupTblPK groupTblPK) {
        this.groupTblPK = groupTblPK;
    }

    public String getArabicGroupName() {
        return arabicGroupName;
    }

    public void setArabicGroupName(String arabicGroupName) {
        this.arabicGroupName = arabicGroupName;
    }

    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (groupTblPK != null ? groupTblPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof GroupTbl)) {
            return false;
        }
        GroupTbl other = (GroupTbl) object;
        if ((this.groupTblPK == null && other.groupTblPK != null) || (this.groupTblPK != null && !this.groupTblPK.equals(other.groupTblPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "edu.aabu.jpademo.GroupTbl[ groupTblPK=" + groupTblPK + " ]";
    }
    
}
