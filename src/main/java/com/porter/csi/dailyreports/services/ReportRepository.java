package com.porter.csi.dailyreports.services;

import com.porter.csi.dailyreports.entities.Report;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jeffryporter on 9/13/17.
 */
public interface ReportRepository extends CrudRepository<Report, Integer>
{
    public Iterable<Report> findByUser(String user);
    public Iterable<Report> findByJobCode(String jobCode);
    public Iterable<Report> findByJobName(String jobName);
    public Iterable<Report> findBySiteWorkers(String siteWorkers);
    public Iterable<Report> findBySiteSupervisor(String siteSupervisor);
}
