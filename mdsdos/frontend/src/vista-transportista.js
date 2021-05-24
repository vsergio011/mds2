import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-vertical-layout.js';

class VistaTransportista extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width:50%
                }
            </style>
<vaadin-vertical-layout style="width: 100%; height: 100%;" id="containerPrincipal"></vaadin-vertical-layout>
`;
    }

    static get is() {
        return 'vista-transportista';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaTransportista.is, VistaTransportista);
