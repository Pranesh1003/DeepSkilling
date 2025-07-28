function CohortDetails({ cohort = {} }) {
  return (
    <div>
      <h3>
        {cohort.cohortCode} -
        <span>{cohort.technology}</span>
      </h3>
      <dl>
        <dt>Start Date:</dt>
        <dd>{cohort.startDate}</dd>
        <dt>End Date:</dt>
        <dd>{cohort.endDate}</dd>
      </dl>
    </div>
  );
}

export default CohortDetails;
