import {html, PolymerElement} from '@polymer/polymer/polymer-element.js';
import '@vaadin/vaadin-ordered-layout/src/vaadin-horizontal-layout.js';

class VistaListadeproductos extends PolymerElement {

    static get template() {
        return html`
<style include="shared-styles">
                :host {
                    display: block;
                    height: 100%;
        			width: 100%;
                }
            </style>
<vaadin-horizontal-layout class="content" style="width: 100%; height: 100%; margin: var(--lumo-space-m); justify-content: flex-start;">
 <h3 id="title" style="align-self: center; margin-right: var(--lumo-space-l);">aaaaaaa</h3>
 <vaadin-horizontal-layout id="vaadinHorizontalLayout" style="background-color: #3b434c36; align-items: center; margin-left: var(--lumo-space-m); padding-bottom: var(--lumo-space-m); padding-top: var(--lumo-space-m); align-self: center; padding-left: var(--lumo-space-l); padding: var(--lumo-space-m); justify-content: flex-start;"></vaadin-horizontal-layout>
</vaadin-horizontal-layout>
`;
    }

    static get is() {
        return 'vista-listadeproductos';
    }

    static get properties() {
        return {
            // Declare your properties here.
        };
    }
}

customElements.define(VistaListadeproductos.is, VistaListadeproductos);
