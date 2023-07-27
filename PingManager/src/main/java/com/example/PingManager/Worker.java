package com.example.PingManager;

import io.camunda.zeebe.client.api.response.ActivatedJob;
import io.camunda.zeebe.client.api.worker.JobClient;
import io.camunda.zeebe.spring.client.annotation.JobWorker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.util.Collections;
import java.util.Map;

@Component
public class Worker {
    //private static Logger log = LoggerFactory.getLogger(Worker.class);

    @JobWorker(type = "send_answer")
    public void SendAnswer(JobClient jobClient, final ActivatedJob job ){

        // Get all variables in Camunda Process
        final Map<String, Object> variables = job.getVariablesAsMap();
        String answer = (String) variables.get("answer");

        // send answer

    }

    /*@JobWorker(type="change_status")
    public void ChangeStatus( JobClient jobClient, final ActivatedJob job){
        final Map<String, Object> variables = job.getVariablesAsMap();
        String status = (String) variables.get("approvalResult");

        //Change status in db
    }*/

    /*private static void logJob(final ActivatedJob job, Object parameterValue) {
        log.info(
                "complete job\n>>> [type: {}, key: {}, element: {}, workflow instance: {}]\n{deadline; {}]\n[headers: {}]\n[variable parameter: {}\n[variables: {}]",
                job.getType(),
                job.getKey(),
                job.getElementId(),
                job.getProcessInstanceKey(),
                Instant.ofEpochMilli(job.getDeadline()),
                job.getCustomHeaders(),
                parameterValue,
                job.getVariables());
    }*/

}
