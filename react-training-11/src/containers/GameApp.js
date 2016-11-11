import React, { Component, PropTypes } from 'react';
import { connect } from 'react-redux';

import NewGame from './NewGame';
import PlayGame from './PlayGame';
import ListGames from './ListGames';

// import {
//   requestTopics,
//   markInterested,
//   markUninterested,
// } from '../reducers/topics';

// import TopicCard from '../components/TopicCard';
// import Container from '../components/Container';

// function mapStateToProps(state) {
//   return {
//     isLoading: state.topics.get('pending'),
//     latestCard: state.topics.get('result'),
//   };
// }

// function mapDispatchToProps(dispatch) {
//   return {
//     onComponentDidMount: () => dispatch(requestTopics()),
//     onMarkInterested: (id) => dispatch(markInterested(id)),
//     onMarkUninterested: (id) => dispatch(markUninterested(id)),
//   };
// }

class GameApp extends Component {
  componentDidMount() {
    this.props.onComponentDidMount();
  }

  render() {
    const {
      latestCard,
      isLoading,
      onMarkInterested,
      onMarkUninterested,
    } = this.props;

    return (
      <div className="container">
        <div className="row">
          <div className="col-md-4 col-md-offset-4">
            <NewGame />
            <PlayGame />
            <ListGames />
          </div>
        </div>
      </div>
    );
  }
}

// Home.defaultProps = {};

// Home.propTypes = {
//   latestCard: PropTypes.object,
//   isLoading: PropTypes.bool.isRequired,
//   onMarkInterested: PropTypes.func.isRequired,
//   onMarkUninterested: PropTypes.func.isRequired,
//   onComponentDidMount: PropTypes.func.isRequired,
// };

// export default connect(
//   mapStateToProps,
//   mapDispatchToProps
// )(Home);

export default GameApp;