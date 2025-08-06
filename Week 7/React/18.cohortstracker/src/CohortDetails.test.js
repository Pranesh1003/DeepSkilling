// CohortDetails.test.js
import React from 'react';
import { shallow, mount } from 'enzyme';
import CohortDetails from './CohortDetails';

const mockCohort = {
  cohortCode: 'A2025',
  technology: 'ReactJS',
  startDate: '2025-01-01',
  endDate: '2025-06-01',
};

describe('Cohort Details Component', () => {
  test('should create the component', () => {
    const wrapper = shallow(<CohortDetails cohort={mockCohort} />);
    expect(wrapper.exists()).toBe(true);
  });

  test('should initialize the props', () => {
    const wrapper = mount(<CohortDetails cohort={mockCohort} />);
    expect(wrapper.props().cohort).toEqual(mockCohort);
  });

  test('should display cohort code in h3', () => {
    const wrapper = mount(<CohortDetails cohort={mockCohort} />);
    expect(wrapper.find('h3').text()).toContain(mockCohort.cohortCode);
  });

  test('should always render same html', () => {
    const wrapper = shallow(<CohortDetails cohort={mockCohort} />);
    expect(wrapper.html()).toMatchSnapshot();
  });
});
