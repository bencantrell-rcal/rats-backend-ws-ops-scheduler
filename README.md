# rats-backend-ws-ops-scheduler

This app provides the endpoints and backend logic to support the floor operations scheduler web app, which is an 
interactive scheduler interface that allows the user to plan and streamline assembly on the operations floor ar Rcal

App Features:

To run:
On the taskbar on the right, under Maven->Lifecycle, double click "clean"
Under Maven->Lifecycle, double click "install"
Navigate to src/main/java/com/rcal/rats-backend-ws-ops-scheduler/OpsSchedulerApplication
Click the green run button in the rop right

Workflow:
Make code changes
Run a Maven clean+install to verify compilation and run static code analysis
Push changes
Under Cloud Build->History, the build pipeline is automatically triggered. An artifact is created with the tag "latest"
Under Cloud Build->Triggers, manually trigger the deployment to the test cluster. It should pull "latest" by default
Monitor test deployment, verify changes
Create PR to merge with dev branch through GitHub
Prepare for prod release, have rollback artifact ready
Upon completion of the PR, merge with main and manually trigger a prod deployment when ready
Validate changes, rollback if necessary



Link to GitHub Repo: https://github.com/bencantrell-rcal/rats-backend-ws-ops-scheduler
Link to Google Cloud Build: https://console.cloud.google.com/cloud-build/dashboard?project=noble-helper-469522-j1
Link to Google Artifact Registry: https://console.cloud.google.com/artifacts/docker/noble-helper-469522-j1/us-south1/rats-backend-ws-ops-scheduler?hl=en&project=noble-helper-469522-j1
Link to Google Kubernetes Engine: https://console.cloud.google.com/kubernetes/list/overview?project=noble-helper-469522-j1&supportedpurview=project