package com.xiaoju.framework.service;

import com.xiaoju.framework.entity.persistent.CaseBackup;

import java.util.List;

/**
 * 备份接口
 *
 * @author didi
 * @date 2020/11/5
 */
public interface CaseBackupService {

    /**
     * 插入备份记录
     *
     * @param caseBackup 备份实体
     * @return 实体
     */
    CaseBackup insertBackup(CaseBackup caseBackup);

    /**
     * 获取一段时间内，某个用例备份记录
     *
     * @param
     * @param caseId 用例id
     * @param startTime 开始时间戳
     * @param endTime 结束时间戳
     * @return 实体
     */
    List<CaseBackup> getBackupByCaseId(Long caseId, String startTime, String endTime);

    /**
     * 删除备份记录
     *
     * @param caseId 用例id
     * @return int
     */
    int deleteBackup(Long caseId);

    /**
     * 根据 id 获取备份记录
     * @param backupId 备份记录id
     * @return
     */
    CaseBackup getBackupById(Long backupId);
}
